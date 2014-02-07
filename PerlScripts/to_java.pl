my $filename = 'tree.txt';
open(my $fh, $filename)
  or die "Could not open file '$filename' $!";

$decisiontree = "package edu\.ucla\.ee\.nesl\.detectmovieapp\; \n\
public class DecisionTree \n\
\{ \n\
double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16\; \n\
int isMovie = 0\; \n\
DecisionTree \(double x1, double x2, double x3, double x4, double x5, double x6,
double x7,  double x8,  double x9,  double x10, double x11, double x12, double
x13, double x14, double x15, double x16\)\n\
\{ this.x1 = x1\; this.x2 = x2\; this.x3 = x3\; this.x4 = x4 \; this.x5 = x5\;
this.x6 = x6\; this.x7 = x7\; this.x8 = x8\; this.x9 = x9\; this.x10 = x10\;
this.x11 = x11\; this.x12 = x12\; this.x13 = x13\; this.x14 = x14\; this.x15 =
x15\; this.x16 = x16\; \} \n\
public boolean isMovie() \n\ 
\{ f1\(\); if\(isMovie == 1\) return true\; else return false\;\}";
print "$decisiontree\n";

while (my $row = <$fh>) {
  chomp $row;
  $row =~ s/^( *)([0-9]+)/public void f$2\(\)\{/;
  $row =~ s/then//;
  $row =~ s/then//;
  $row =~ s/elseif/else if/;
  $row =~ s/node ([0-9]+)/\{f$1\(\)\;\}/;
  $row =~ s/node ([0-9]+)/\{f$1\(\);\}/;
  $row =~ s/class (= [0-9]+)$/isMovie $1;\}/;
  $row =~ s/else ([0-9]+)$/else \{isMovie = $1;\}\}/;
  $row =~ s/if ([^ ]*) /if \($1\)/;
  $row =~ s/else if ([^ ]*) /else if \($1\)/;
  print "$row\n";
}
print "\}";
