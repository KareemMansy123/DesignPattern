package info.info.strategypattern.strategyPattern.example2

import info.info.strategypattern.strategyPattern.example2.Nationality.Nationality
import info.info.strategypattern.strategyPattern.example2.gender.Gender

class UsersStore {
    fun store(name : String, gender : Gender, nationality : Nationality){
        gender.gender(name)
        nationality.nationality(name)
    }
}