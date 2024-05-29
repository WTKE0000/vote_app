//plugins {
//    alias(libs.plugins.google.gms.google.services) apply false
//    `java-library`
//}
//dependencies {
//    "implementation"("org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
//    "implementation"("org.jetbrains.kotlin:kotlin-reflect:1.9.20")
//}

buildscript{
    dependencies{
        classpath("com.google.gms:google-services:4.3.15");
    }
}

plugins {
    alias(libs.plugins.google.gms.google.services) apply false
    `java-library`
}