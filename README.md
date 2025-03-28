TalesVault is an interactive story-driven Cross Platform puzzle game developed for both Android and IOS. The game features a dynamic narrative system powered by the Gemini API, ensuring an adaptive storytelling experience based on user choices.


It is an immersive story-driven puzzle game where players navigate mysterious rooms, solving intricate puzzles to uncover hidden secrets
# Demo
PS: unmute the video

https://github.com/user-attachments/assets/c6f656bb-6a5c-4ef2-b7ed-e97f05d43ed7

# How to run the project

## Prerequisites

You need a Mac with macOS to run iOS-specific code on simulated or real devices. You will also need [AndroidStudio](https://developer.android.com/studio), [XCode](https://developer.apple.com/xcode/), [JDK](https://www.oracle.com/java/technologies/downloads/?er=221886), [KMP plugin](https://kotlinlang.org/docs/multiplatform-plugin-releases.html) and [Kotlin plugin](https://kotlinlang.org/docs/releases.html#update-to-a-new-release). Before downloading the project, please follow the [set up environment guide](https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-create-first-app.html#set-up-the-environment).

## Set up a Gemini API key and pick a model

Create a new Gemini Api Key [here](https://aistudio.google.com/) and pick a model from [here](https://ai.google.dev/gemini-api/docs/models/gemini). Create a local.properties file in the project and add the API key and the model variant name as follows:

```
apiKey= Enter your above generated API key
model=gemini-1.5-flash(or any other model used by your API)
```

You are now ready to [follow the run application guide for either Android or iOS](https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-create-first-app.html#run-your-application)!

# Built using the following stack:


1. **[Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)**  
   Enables sharing code across iOS, Android, JVM, Web, and native platforms.  

2. **[Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)**  
   Declarative UI framework for building cross-platform apps in Kotlin.  

3. **[Gemini SDK](https://github.com/PatilShreyas/generative-ai-kmp/tree/main)**  
   SDK for building Gemini protocol-based applications built for KMP. 

4. **[Kotlinx-serialization](https://github.com/Kotlin/kotlinx.serialization)**  
   Multi-format reflectionless serialization

5. **[Koin](https://insert-koin.io/docs/reference/koin-mp/kmp/)**  
   Lightweight dependency injection framework for Kotlin projects.  

6. **[Room](https://developer.android.com/kotlin/multiplatform/room)**  
   Abstraction layer over SQLite for simplified database interactions.  

7. **[SQLite](https://developer.android.com/kotlin/multiplatform/sqlite)**  
   Lightweight embedded relational database for local data storage.  

8. **[Napier](https://github.com/AAkira/Napier)**  
   Multiplatform logging library for Kotlin projects.  

9. **[Build Konfig](https://github.com/yshrsmz/BuildKonfig)**  
   Gradle plugin for type-safe configuration in multiplatform projects.


