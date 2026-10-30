import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "MangaRaw18"
    versionCode = 1
    contentWarning = ContentWarning.NSFW
    libVersion = "1.6"
    theme = "wpcomics"

    source {
        lang = "ja"
        baseUrl {
            custom("https://mangaraw18.net")
        }
    }

    deeplink {
        path("/manga/..*")
    }
}