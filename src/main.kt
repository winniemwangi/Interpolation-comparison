fun main(){
    char()
    introduction("winnie", "20")
    length()
    comparison("winnie")

}
fun char(){
    var name = "akirachix"
    println(name[0].toString()+name[2]+name[3])

}

fun introduction(name:String, age:String){
    var first = ("Hi my name is " +name)
    var last = ("and I am " + age + " years old")
    var combine = first + " " + last
    println(combine)
}

fun length(){
    var country = "Kenya"
    println(country.length)
}

fun comparison(name:String){
    if (name.equals("winnie")){
        println("that's me")

    }
    else{
        println("I don't know who that is")
    }

}