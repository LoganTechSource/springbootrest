This is a sample spring boot prject. It is producing two endpoints. 
/calculationservice/add/ GET endpoint to produce summation of the given numbers.
/calculationservice/subtract/ GET endpoint to produce subtraction of the given number.

Sample: 
  - /calculationservice/add/
    - http://localhost:9921/calculationservice/add/?numbers=15,60,1000
      - The given 3 number(s) sum value is 1075
    
  - /calculationservice/subtract/
    - http://localhost:9921/calculationservice/subtract/?numbers=23,56,15454,87,54
      - Response: The given 5 number(s) subtraction value is -15674
