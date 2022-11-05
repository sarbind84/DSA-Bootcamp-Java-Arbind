//Patterns
Tips and Tricks
1.Run outer loop to the number of rows.
2.Find relation between rows and number of columns or n.
3.keeping track of outer loop if it's opposing in nature use counter,
or n-i use.
4.if next line consist of 2 space decrement line like
 8 star, 6 star, 4 star, 2 star like wise
 or star decrement then run loop till . j = 2*(n-i)
5. In case of hallow patterns see all block try adding rows and columns
6. if pattern is 1star, 3star, 5 star use   int stars = (2 * i) - 1;...
if reverse  2*(n-i);
7. Pascal Triangle use:
            for (j = 0; j <= i; j++) {
                // nCr formula
                System.out.print("    " + g.factorial(i) / (g.factorial(i - j) * g.factorial(j)));
            }

8. go normal in
filled butterfly..
9. for arrow star like this
-
--
---
--
-
use spaces     int sideSpaces = i>n?n-(i-n):i;
n-(i-n):i; for below part use this..

10. Diamond logic
int n = 8;
int stars = i<=n/2 ?(2*i)-1 :2*(n-i)-1;
int spacess = i<=n/2 ? n/2-i: (i-n/2);