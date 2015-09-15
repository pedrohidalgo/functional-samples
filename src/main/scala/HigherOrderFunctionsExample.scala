object HigherOrderFunctionsExample {
    def lengthCounter(myString:String) = myString.length
    def wordCounter(myString:String) = myString.split(" ").length
    def letterFCounter(myString:String) = myString.count(_.toLower.charValue == 'f')
    
    def processer(f: String => Int, aString: String) = {
        val result = f.apply(aString)
        println("the result processed: "+result)
        result
    }
    
}