class compte(var balance: Double = 0.0) {

    fun getBalance(): Double = this.balance


    fun deposit(amount: Double) {

        this.balance += amount

    }


    fun withdraw(amount: Double) {

        if (amount <= this.balance) {

            this.balance -= amount

        } else {

            println("Insufficient funds to complete the withdrawal.")

        }

    }


    fun addInterest(interestRate: Double) {

        this.balance *= (1 + interestRate)

    }

}


fun main() {

    val account = Account(100.0)

    println("Initial balance: ${account.getBalance()}")

    account.deposit(50.0)

    println("Balance after deposit: ${account.getBalance()}")

    account.withdraw(20.0)

    println("Balance after withdrawal: ${account.getBalance()}")

    account.addInterest(0.05)

    println("Balance after adding 5% interest: ${account.getBalance()}")

}