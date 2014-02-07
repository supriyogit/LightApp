package edu.ucla.ee.nesl.detectmovieapp;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import com.google.protobuf.InvalidProtocolBufferException;

import edu.ucla.ee.nesl.detectmovieapp.FirewallConfigMessages.*;

import android.util.Log;

public class FirewallRuleParser {
		public final String TAG = "FirewallRuleParser";
		
		public final int ACTION_SUPPRESS = 1;
        public final int ACTION_CONSTANT = 2;
        public final int ACTION_DELAY = 3;
        public final int ACTION_PERTURB = 4;
        public final int ACTION_PASSTHROUGH = 5;
		
        private byte[] readFirewallConfig() {
        final String fileName = "/data/firewall-config"; 
        byte[] buf; 
        try { 
            File file = new File(fileName); 
            BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(file)); 
            if (file.length() > Integer.MAX_VALUE) { 
                Log.e(TAG, "Unable to read " + fileName + ". File too large"); 
            }    
            buf = new byte[(int) file.length()]; 
            inStream.read(buf, 0, (int) file.length()); 
            inStream.close(); 
            Log.d(TAG,"Successfully Opened file");
        }    
        catch (Exception e) { 
            Log.e(TAG, "Unable to read firewall-config file"); 
            buf = new byte[0]; // return empty data 
        }    
        return buf; 
    }

    public int checkIfRulePresent(String pkgName, int sensorType) {
        byte[] rawFirewallConfigBytes = readFirewallConfig();
        int actionType = ACTION_PASSTHROUGH;
        try {
            FirewallConfig firewallConfig = FirewallConfig.parseFrom(rawFirewallConfigBytes);
            for(Rule rule: firewallConfig.getRuleList()) {
            	Log.d(TAG, "pkgName = " + rule.getPkgName());
                if((rule.getPkgName().equalsIgnoreCase(pkgName)) && (rule.getSensorType() == sensorType)) {
                	actionType = rule.getAction().getActionType().getNumber();
                	return actionType;
                }
            }
        }
        catch (InvalidProtocolBufferException ex) {
            Log.e(TAG, "Unable to parse the firewallConfig string");
        }
        return actionType;
    }
}
