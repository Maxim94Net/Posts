data class Post(
    val id: Int = 0,                     //айди поста
    val text: String,                    //текст поста
    val date: Int = 0,                   //дата поста
    val canEdit: Boolean = true,         //может ли владелец поста его редактировать - да
    val canPin: Boolean = true,          //может ли текущий пользователь закрепить запись да
    val marketAsAds: Boolean = false,    //есть ли реклама в посте - нет
    val ownerId: Int = 0,                //айди владельца поста

    var Likes:Likes
)
data class Likes(val count: Int = 0)