every time when x % 10 we get the last digit of the number 

    X = 123

    123 % 10 -> 3   rev = rev(0) * 10 + 3 (3)
then we divide x by 10
    
    123 / 10 -> 12

and cycle it till x == 0

    12 % 10 -> 2    rev = rev(3) * 10 + 2 (32)
    12 / 10 -> 1

    1 % 10 - > 1    rev = rev(32) * 10 + 1 (321)
    1 / 10 -> 0