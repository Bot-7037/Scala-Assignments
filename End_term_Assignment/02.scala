object Calculator {
    def main(args: Array[String]):Unit= {
        println("|=====================|")
        println("|Name : Himanshu Negi |")
        println("|Section : DS         |")
        println("|Roll No : 32         |")
        println("|=====================|")
        println("Enter two numbers");
        val a = scala.io.StdIn.readInt();
        val b = scala.io.StdIn.readInt();

        println("Enter choice \n1. Add\n2. Subtract\n3. Multiply\n4.Divide\n");
        val choice = scala.io.StdIn.readInt();

        // functions
        var add = (a: Int, b: Int) => a + b;
        var subtract = (a: Int, b: Int) => a - b;
        var multiply = (a: Int, b: Int) => a * b;
        var divide = (a: Int, b: Int) => a / b;

        if (choice == 1) {
        println(add(a, b));
        } else if (choice == 2) {
        println(subtract(a, b));
        } else if (choice == 3) {
        println(multiply(a, b));
        } else {
        println(divide(a, b));
        }
    }
}
