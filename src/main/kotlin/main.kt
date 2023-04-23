fun main() {

    val original = Post(text = "lol", Likes = Likes())

    val newPost1 = Post(text = "Yi", Likes = Likes(5) )

    val testPost = Post(2,"543", Likes = Likes())

    println(WallService.add(original))

    println(WallService.add(newPost1))

    println(WallService.update(testPost))

}