'''


@author: McClain

Find the greatest product of five consecutive digits
in the 1000-digit number(located in prob8.txt).
http://projecteuler.net/problem=8
'''

fileName = 'prob8.txt'
greatest_product = 0

with open(fileName, 'r') as f:
    content = f.read().replace("\n", "")
        
for i in range(0, len(content)):
    hold_product = 1
    hold_string = content[i: i+5]
    
    for g in hold_string:
        hold_product *= int(g)
    if hold_product > greatest_product:
        greatest_product =hold_product
           
print(greatest_product)    
    
          
            
    
     
            


        
        