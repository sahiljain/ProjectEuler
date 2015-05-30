
curTri = 1
adder = 2

while True:
    multipliers = []
    #let's test the current curTri:
    tester = curTri
    i=2
    
    while tester > 1:
        toadd = 0
        while tester%i==0:
            tester/=i
            toadd+=1
        if toadd>0:
            multipliers.append(toadd)
        i+=1

    numfactors = 1
    for x in multipliers:
        numfactors*=x+1
    if numfactors > 500:
        print str(curTri) + " has > 500 factors"
        break
    curTri+=adder
    adder+=1
input()