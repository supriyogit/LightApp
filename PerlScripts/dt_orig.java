public class DecisionTree {
        double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15;
        int isMovie = 0;

DecisionTree (double x1, double x2, double x3, double x4, double x5,
               double x6, double x7,  double x8,  double x9,  double x10,
               double x11, double x12, double x13, double x14, double x15) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
        this.x6 = x6;
        this.x7 = x7;
        this.x8 = x8;
        this.x9 = x9;
        this.x10 = x10;
        this.x11 = x11;
        this.x12 = x12;
        this.x13 = x13;
        this.x14 = x14;
        this.x15 = x15;
}

public boolean isMovie() {
        if(f1() == 1)
                return true;
        else
                return false;
}
public void f1(){  if (x6<0.110602) {f2();} else if (x6>=0.110602) {f3();} else {isMovie = 1;}}
public void f2(){  if (x2<58.1151) {f4();} else if (x2>=58.1151) {f5();} else {isMovie = 1;}}
public void f3(){  if (x10<14.8034) {f6();} else if (x10>=14.8034) {f7();} else {isMovie = 1;}}
public void f4(){  if (x2<37.8245) {f8();} else if (x2>=37.8245) {f9();} else {isMovie = 1;}}
public void f5(){  if (x3<12.3656) {f10();} else if (x3>=12.3656) {f11();} else {isMovie = 0;}}
public void f6(){  if (x10<5.27073) {f12();} else if (x10>=5.27073) {f13();} else {isMovie = 1;}}
public void f7(){  if (x6<0.37155) {f14();} else if (x6>=0.37155) {f15();} else {isMovie = 1;}}
public void f8(){  isMovie = 1;}
public void f9(){  if (x11<4.46598) {f16();} else if (x11>=4.46598) {f17();} else {isMovie = 1;}}
public void f10(){  if (x12<5.8256) {f18();} else if (x12>=5.8256) {f19();} else {isMovie = 0;}}
public void f11(){  if (x9<0.101637) {f20();} else if (x9>=0.101637) {f21();} else {isMovie = 1;}}
public void f12(){  isMovie = 1;}
public void f13(){  if (x6<0.193213) {f22();} else if (x6>=0.193213) {f23();} else {isMovie = 1;}}
public void f14(){  if (x2<45.5535) {f24();} else if (x2>=45.5535) {f25();} else {isMovie = 1;}}
public void f15(){  isMovie = 1;}
public void f16(){  if (x14<0.0963978) {f26();} else if (x14>=0.0963978) {f27();} else {isMovie = 1;}}
public void f17(){  if (x5<1.47078) {f28();} else if (x5>=1.47078) {f29();} else {isMovie = 1;}}
public void f18(){  if (x3<6.30377) {f30();} else if (x3>=6.30377) {f31();} else {isMovie = 1;}}
public void f19(){  if (x15<4.13181) {f32();} else if (x15>=4.13181) {f33();} else {isMovie = 0;}}
public void f20(){  isMovie = 0;}
public void f21(){  if (x13<2.94398) {f34();} else if (x13>=2.94398) {f35();} else {isMovie = 1;}}
public void f22(){  if (x5<1.56706) {f36();} else if (x5>=1.56706) {f37();} else {isMovie = 1;}}
public void f23(){  isMovie = 1;}
public void f24(){  if (x13<0.0353727) {f38();} else if (x13>=0.0353727) {f39();} else {isMovie = 1;}}
public void f25(){  if (x5<2.93541) {f40();} else if (x5>=2.93541) {f41();} else {isMovie = 1;}}
public void f26(){  isMovie = 0;}
public void f27(){  isMovie = 1;}
public void f28(){  isMovie = 1;}
public void f29(){  if (x12<4.4355) {f42();} else if (x12>=4.4355) {f43();} else {isMovie = 1;}}
public void f30(){  if (x15<0.989255) {f44();} else if (x15>=0.989255) {f45();} else {isMovie = 0;}}
public void f31(){  isMovie = 1;}
public void f32(){  isMovie = 0;}
public void f33(){  if (x2<75.4214) {f46();} else if (x2>=75.4214) {f47();} else {isMovie = 1;}}
public void f34(){  if (x10<5.21049) {f48();} else if (x10>=5.21049) {f49();} else {isMovie = 1;}}
public void f35(){  isMovie = 1;}
public void f36(){  isMovie = 1;}
public void f37(){  if (x2<55.7968) {f50();} else if (x2>=55.7968) {f51();} else {isMovie = 1;}}
public void f38(){  isMovie = 0;}
public void f39(){  if (x9<1.58684) {f52();} else if (x9>=1.58684) {f53();} else {isMovie = 1;}}
public void f40(){  if (x2<62.7928) {f54();} else if (x2>=62.7928) {f55();} else {isMovie = 1;}}
public void f41(){  if (x11<2.90223) {f56();} else if (x11>=2.90223) {f57();} else {isMovie = 0;}}
public void f42(){  if (x7<0.520473) {f58();} else if (x7>=0.520473) {f59();} else {isMovie = 1;}}
public void f43(){  if (x9<0.595817) {f60();} else if (x9>=0.595817) {f61();} else {isMovie = 0;}}
public void f44(){  isMovie = 0;}
public void f45(){  isMovie = 1;}
public void f46(){  isMovie = 1;}
public void f47(){  isMovie = 0;}
public void f48(){  isMovie = 1;}
public void f49(){  isMovie = 0;}
public void f50(){  if (x12<19.2152) {f62();} else if (x12>=19.2152) {f63();} else {isMovie = 1;}}
public void f51(){  if (x2<76.1474) {f64();} else if (x2>=76.1474) {f65();} else {isMovie = 0;}}
public void f52(){  isMovie = 1;}
public void f53(){  if (x7<22.9947) {f66();} else if (x7>=22.9947) {f67();} else {isMovie = 1;}}
public void f54(){  isMovie = 1;}
public void f55(){  isMovie = 0;}
public void f56(){  isMovie = 1;}
public void f57(){  if (x2<80.5087) {f68();} else if (x2>=80.5087) {f69();} else {isMovie = 0;}}
public void f58(){  isMovie = 1;}
public void f59(){  isMovie = 0;}
public void f60(){  isMovie = 0;}
public void f61(){  if (x2<47.8182) {f70();} else if (x2>=47.8182) {f71();} else {isMovie = 1;}}
public void f62(){  if (x8<0.498172) {f72();} else if (x8>=0.498172) {f73();} else {isMovie = 1;}}
public void f63(){  isMovie = 0;}
public void f64(){  isMovie = 0;}
public void f65(){  isMovie = 1;}
public void f66(){  if (x15<1.15645) {f74();} else if (x15>=1.15645) {f75();} else {isMovie = 1;}}
public void f67(){  isMovie = 0;}
public void f68(){  isMovie = 0;}
public void f69(){  isMovie = 1;}
public void f70(){  if (x15<1.73633) {f76();} else if (x15>=1.73633) {f77();} else {isMovie = 1;}}
public void f71(){  if (x3<10.6692) {f78();} else if (x3>=10.6692) {f79();} else {isMovie = 0;}}
public void f72(){  isMovie = 1;}
public void f73(){  if (x15<0.820759) {f80();} else if (x15>=0.820759) {f81();} else {isMovie = 1;}}
public void f74(){  if (x15<0.957788) {f82();} else if (x15>=0.957788) {f83();} else {isMovie = 0;}}
public void f75(){  isMovie = 1;}
public void f76(){  isMovie = 1;}
public void f77(){  isMovie = 0;}
public void f78(){  if (x15<4.22366) {f84();} else if (x15>=4.22366) {f85();} else {isMovie = 0;}}
public void f79(){  isMovie = 1;}
public void f80(){  isMovie = 1;}
public void f81(){  isMovie = 0;}
public void f82(){  isMovie = 1;}
public void f83(){  isMovie = 0;}
public void f84(){  isMovie = 0;}
public void f85(){  isMovie = 1;}
}
