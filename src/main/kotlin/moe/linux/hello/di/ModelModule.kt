package moe.linux.hello.di

import com.github.salomonbrys.kodein.Kodein

fun ModelModule() = Kodein.Module {
    //    bind<FirebaseModel>() with provider { FirebaseModel(kodein) }
}