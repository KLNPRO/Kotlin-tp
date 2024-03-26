class Personne {
    var nom = ""
    var taille = 0.0
    var poids = 0
    2constructor()
    constructor(nom: String, taille: Double, poids: Int) {
        this.nom = nom
        this.taille = taille
        this.poids = poids
    }
    fun imc(): Double{
        return this.poids /(this.taille * this.taille)
    }
    fun significationImc(): String {
        var signification = ""
        if ( this.imc() < 18.5 ){
            signification = "maigreur"
        }
        else if ( this.imc() < 24.9){
            signification = "normal"
        }
        else if (this.imc() < 29.9){
            signification = "surpoids"
        }
        else {
            signification = "obésité"
        }
        return signification
    }
    override fun toString(): String {
        return "Personne(nom='$nom', taille=$taille, poids=$poids)"
    }
}