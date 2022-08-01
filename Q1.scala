object Q1{
    def main(args: Array[String]): Unit = {
    
    print("Enter The deposit amount : ");
    var num = scala.io.StdIn.readDouble ;
    var interest: Double = calculateInterest(num)
    print("The interest is "+ interest);
    
}  
    def calculateInterest(num:Double):Double = num match{

        case  x  if x<=20000        =>    x*0.02
        case  x  if x<=200000       =>    x*0.04
        case  x  if x<=2000000      =>    x*0.035
        case  x  if x>2000000       =>    x*0.065
    }
}