package cz.sovanegger.gitdemo

class Film {
	String name
	String director
	
    static constraints = {
		name blank: false
		director nullable: true
    }
}
