package com.app.base.mainapp.utils

import java.util.*


object Constants {
    lateinit var current_locale: Locale
    const val API_KEY = "nRl7I0dAj0ahppaET5hmvtt924qtLuS9"
    const val BASE_URL = "https://apis.accela.com/"

    const val LANGUAGE_ENGLISH = "en"
    const val LANGUAGE_AR = "ar"
    var SELECTED_LANGUAGE = "en"

    // Response Code
    const val SUCCESS_CODE = 0

    const val VIA_NOTIFICATION = "via_notification"
    const val TODO = "todos"

    //ACCELA LOGIN DETAILS
    const val ACCELA_GRANT_TYPE = "password"
    const val ACCELA_SCOPE = "users inspectors records inspections professionals addresses owners parcels contacts reports settings documents workflows timeaccounting filters agencies conditions payments inspectorapp_update_inspection run_emse_script"
    const val ACCELA_CLIENT_ID = "637268706865414368"
    const val ACCELA_CLIENT_SECRET = "939023bd28d84811913b77e75e71e3d1"
}