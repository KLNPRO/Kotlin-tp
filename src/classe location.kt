class Location {
    var nom = ""
    var categorie = 'x'
    var nbKmParcourus = 0
    var nbJoursLocation = 0
    constructor()
    constructor(nom: String, categorie: Char, nbKmParcourus: Int, nbJoursLocation:
    Int) {
        3this.nom = nom
        this.categorie = categorie
        this.nbKmParcourus = nbKmParcourus
        this.nbJoursLocation = nbJoursLocation
    }
    fun montantJour() : Int {
        var montant = 0
        if ( this.categorie == 'E')
            montant = 30
        else if ( this.categorie == 'C')
            montant = 50
        else if ( this.categorie == 'L')
            montant = 70
        return montant
    }
    fun montantLocation() = this.montantJour() * this.nbJoursLocation
    fun kmSupplementaire(): Double {
        var km = this.nbKmParcourus - (100.0 * this.nbJoursLocation)
        return ( if(km > 0.0) km * 0.5 else 0.0)
    }
    fun montantTotal(): Double = this.montantLocation() + this.kmSupplementaire()
}