class Employe(

    val matricule: Int,

    val firstName: String,

    val lastName: String,

    val yearHired: Int,

    val salary: Double

) {

    fun anciennete(): Int {

        // Calculate the tenure by subtracting the hire year from the current year.

        return LocalDate.now().year - yearHired

    }

}


fun main() {

    print("Enter the employee's matricule: ")

    val matricule = readLine()!!.toInt()

    print("Enter the employee's first name: ")

    val firstName = readLine()!!.toString()

    print("Enter the employee's last name: ")

    val lastName = readLine()!!.toString()

    print("Enter the employee's year hired: ")

    val yearHired = readLine()!!.toInt()

    print("Enter the employee's salary: ")

    val salary = readLine()!!.toDouble()

    val employee = Employe(matricule, firstName, lastName, yearHired, salary)

    println("The employee's tenure: ${employee.anciennete()} years")

}