object pattern {
    def main(args: Array[String]):Unit ={
        println(pattern_match(0))
    }

    def pattern_match(x:Int): String = x match
    {
        case 1 => "First day is Sunday"
        case 2 => "Second day is Monday"
        case 3 => "Third day is Tuesday"
        case _ => "This is not right input"
    }

}
