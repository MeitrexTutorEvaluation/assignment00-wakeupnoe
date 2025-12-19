# Hello MEITREX

Willkommen zu deiner **ersten MEITREX-Programmieraufgabe**!   
In diesem Tutorial lernst du, wie du mit **GitHub Classroom** arbeitest, deine Lösung mit **Git** pushst und wie **automatische Tests** deinen Code überprüfen.
Das Ergebnis der automatisierten Tests wird dir in dem Code Assignment in MEITREX angezeigt.

---

## Ziel der Aufgabe

Schreibe ein einfaches Java-Programm, das die 4 Funktionen 
```
public static int add(int a, int b)
public static int subtract(int a, int b)
public static int multiply(int a, int b)
public static int factorial(int n)
```
korrekt berechnet.

Diese Aufgabe soll dir zeigen, wie du deinen Code mit **Git** einreichst und dein Ergebnis in **MEITREX** einsiehst. Außerdem kann der Tutor dir Fragen zum code beantworten, nachdem du eine Lösung eingereicht hast. Tob dich aus :)

---

## So gehst du vor

1. Klicke in **MEITREX** auf **„START ASSIGNMENT“** – du wirst zu GitHub Classroom weitergeleitet.
2. Akzeptiere das Coding Assignment in GitHub Classroom (**Accept this assignment**).  
3. Ein persönliches Repository (z. B. `meitrex-tutorial-code-assignment-username`) wird erstellt.  
4. Klone es auf deinen Rechner:  
   ```bash
   git clone <dein-repo-link>
   ```
5. Öffne das Projekt in deiner IDE (z. B. IntelliJ oder VS Code).  
6. Implementiere den Code in `Main.java`.  
7. Teste dein Programm lokal und **pushe** es dann:  
   ```bash
   git add .
   git commit -m "Hello MEITREX Aufgabe gelöst"
   git push
   ```
8. GitHub Classroom führt die automatisierten Tests aus (Das kann bis zu einer Minute dauern)
9. Schau in MEITREX nach der Bewertung.

---

## Aufgabenbeschreibung

Du findest im Repository eine Datei:

```
src/main/java/Main.java
```

Ergänze den Code so, dass beim Ausführen die Funktionen
```
public static int add(int a, int b)
public static int subtract(int a, int b)
public static int multiply(int a, int b)
public static int factorial(int n)
---
korrekt berechnet werden.


## Automatische Tests

Deine Lösung wird nach jedem Push automatisch getestet.  
Das Ergebnis wird dir in dem jeweiligen Code Assignment in MEITREX angezeigt.

**Viel Erfolg!**
