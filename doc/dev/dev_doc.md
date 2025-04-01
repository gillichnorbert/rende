# Fejlesztő dokumentáció

## Az alkalmazás célja

Rendezés bemutatása egy egyszerű Java programmal.

## Használt eszközök

A Java nyelven írt program Visual Studio Code-dal készűlt. A projekt a "No build tools" projekt-generálóval készült.

Windows képmetsző a képernyőképekhez.

A forráskódok az src könyvtárban találhatók.

## Az App osztály

Az App osztály az alkalmazás belépési pontja. Csak az alkalmazás indítására használjuk.

## A Store osztály

A Store osztály segítségével beolvassuk a .csv kiterjesztésű fájl tartalmát. 

### A readFile metódus

A tryReadFile() metódus olvassa be ténylegesen a fájl tartalmát, amelynek a hibakezelője a readFile() metódus.

A fájl beolvasásakor a readFile()-t kell meghívni. A hibakezelő readFile, meghívja az ipari kódot, a tényleges fájlbeolvasást.

## Az Employee osztály

Az Employee osztály a fájlból beolvasott dolgozók tárolására szolgál. Egy Employee objektumban a fájl egyetlen sora tárolható.