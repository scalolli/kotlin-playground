package practice.interfaces

interface User {
    val nickName: String
}

class PrivateUser(override val nickName: String): User

class SubscribingUser(val email: String) : User {
    override val nickName: String
        get() = email.substringBeforeLast("@")
}
