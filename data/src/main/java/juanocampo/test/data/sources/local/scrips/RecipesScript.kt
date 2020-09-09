package juanocampo.test.data.sources.local.scrips

import com.google.gson.Gson
import juanocampo.test.data.sources.local.entity.RecipeData
import juanocampo.test.data.sources.local.restaurant.StepData

val DEFAULT_RECIPES = arrayListOf(
    RecipeData(
        name = "Costillas BBQ Colombianas",
        ownerId = JUAN_OCAMPO.id,
        categoryId = arrayListString(SWEET.id, BBQ.id),
        steps = Gson().toJson(
            arrayListOf(
                StepData("Cocinar costilla"),
                StepData("Salsa en caldo costilla"),
                StepData("Sellar costillas en aceite"),
                StepData("Usa el caldo que queda de las cotillas, Agregar salsa bbq, coca cola y dejar reducir, junto con las costillas hasta que esten caramelizadas. 30 Mins Aprox")
            )),
        ingredients = arrayListString(DEFAULT_INGREDIENTS.map { it.id })
    )
)

