import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun updateExisting() {
        WallService.add(Post( text =  "run", Likes = Likes(8)))
        WallService.add(Post( text =  "run", Likes = Likes(9)))
        WallService.add(Post( text =  "run", Likes = Likes(7)))

        val update = Post(3,"stop", Likes = Likes(1))
        val result = WallService.update(update)
        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        WallService.add(Post( text =  "run", Likes = Likes(8)))
        WallService.add(Post( text =  "run", Likes = Likes(9)))
        WallService.add(Post( text =  "run", Likes = Likes(7)))
        WallService.add(Post( text =  "run", Likes = Likes(22)))

        val update = Post(5,"stop", Likes = Likes(1))
        val result = WallService.update(update)
        assertFalse(result)
    }

    @Test
    fun addTest() {
        val post = WallService.add(Post(text = "text", Likes = Likes(1)))
        val result = post.id
        assertNotEquals(result,0)
    }

}