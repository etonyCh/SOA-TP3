# TP3 : Développement d'un Service REST Calculatrice avec Jakarta EE (JAX-RS)

Ce projet implémente une API REST simple pour une calculatrice, permettant d'effectuer les opérations arithmétiques de base (addition, soustraction, multiplication, division). Il utilise Jakarta EE (JAX-RS) avec l'implémentation Jersey.

## Prérequis

*   **Java JDK** 17 ou supérieur
*   **Apache Maven** 3.8 ou supérieur
*   **Apache Tomcat** 10 ou supérieur (compatible Jakarta EE 10)

## Installation et Construction

1.  Clonez ce dépôt ou téléchargez les sources.
2.  Ouvrez un terminal à la racine du projet.
3.  Compilez et packagez le projet avec Maven :

    ```bash
    mvn clean package
    ```

    Cela générera un fichier `tp3-calculatrice.war` dans le dossier `target/`.

## Déploiement

1.  Assurez-vous que votre serveur Tomcat est arrêté.
2.  Copiez le fichier `target/tp3-calculatrice.war` dans le dossier `webapps` de votre installation Tomcat.
3.  Démarrez Tomcat (ex: `bin/startup.sh` ou `bin/startup.bat`).
4.  Le service sera accessible à l'adresse : `http://localhost:8080/tp3-calculatrice`
    *   **Note :** Si vous avez configuré Tomcat sur un autre port (ex: 8090 suite à des conflits), remplacez `8080` par votre port dans l'URL (ex: `http://localhost:8090/tp3-calculatrice`).

## Utilisation de l'API

L'API expose les endpoints suivants sous le chemin de base `/api/calcul`.

### 1. Addition
*   **Méthode :** `GET`
*   **URL :** `/api/calcul/somme`
*   **Paramètres :** `a` (nombre), `b` (nombre)
*   **Exemple :** `http://localhost:8080/tp3-calculatrice/api/calcul/somme?a=10&b=5` (ou port 8090)
*   **Réponse JSON :**
    ```json
    {
        "val1": 10.0,
        "val2": 5.0,
        "type": "ADDITION",
        "result": 15.0
    }
    ```

### 2. Soustraction
*   **Méthode :** `GET`
*   **URL :** `/api/calcul/soustraction`
*   **Paramètres :** `a` (nombre), `b` (nombre)
*   **Exemple :** `http://localhost:8080/tp3-calculatrice/api/calcul/soustraction?a=10&b=5`

### 3. Multiplication
*   **Méthode :** `GET`
*   **URL :** `/api/calcul/multiplication`
*   **Paramètres :** `a` (nombre), `b` (nombre)
*   **Exemple :** `http://localhost:8080/tp3-calculatrice/api/calcul/multiplication?a=10&b=5`

### 4. Division
*   **Méthode :** `GET`
*   **URL :** `/api/calcul/division`
*   **Paramètres :** `a` (nombre), `b` (nombre)
*   **Exemple :** `http://localhost:8080/tp3-calculatrice/api/calcul/division?a=10&b=2`
*   **Note :** Si `b` vaut 0, l'API renvoie une erreur HTTP 400 (Bad Request).

## Tests

Le projet inclut des tests unitaires pour valider la logique métier et les endpoints. Pour les exécuter :

```bash
mvn test
```

## Structure du Projet

*   `src/main/java/tn/fss/lsi3/soa/tp3/` : Code source Java.
    *   `Calculatrice.java` : Logique métier.
    *   `CalculRest.java` : Ressource JAX-RS (Endpoints).
    *   `Operation.java` : Modèle de données.
    *   `RestApplication.java` : Configuration de l'application JAX-RS.
*   `src/test/java/` : Tests unitaires.
*   `pom.xml` : Configuration Maven et dépendances.
