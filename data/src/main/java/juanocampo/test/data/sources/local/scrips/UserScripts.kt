package juanocampo.test.data.sources.local.scrips

import juanocampo.test.data.sources.local.user.UserData

val JUAN_OCAMPO = UserData(
    id = "th2Jn0Ku7DXjKYKpFe8d49muNTJ2",
    name = "Juan Manuel Ocampo Valencia",
    age = 30,
    email = "ing.juanocampo@gmail.com"
)

val DEFAULT_USERS = arrayListOf(
    JUAN_OCAMPO,
    UserData(
        id = "2",
        name = "Juliana Maria Berrio Restrepo",
        age = 25,
        email = "juli@gmail.com"
    )
)