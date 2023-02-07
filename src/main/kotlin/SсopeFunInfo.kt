data class SсopeFunInfo(
    private val review: String,
                        private val objectReference: String,
                        private val returnValue: String,
                        private val isExtensionFunction: String,
                        private val whenUse: String) {

    override fun toString(): String {
        return "review: $review,\nobjectReference: $objectReference,\nReturn value: $returnValue,\n" +
                "is extension function: $isExtensionFunction,\nWhen use: $whenUse "
        //return super.toString()
    }

}
