my $filename = 'tree.txt';
open(my $fh, $filename)
        or die "Could not open file '$filename' $!";
while (my $row = <$fh>) {
        chomp $row;
        my $new = $row =~ s/^( *)([0-9]+)/void f$2\(void\)\{/r;
        print "$newer\n";
}
