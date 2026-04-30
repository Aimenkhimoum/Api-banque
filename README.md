# 🏦 Système de Gestion Bancaire MVP

Ce projet est un "Proof of Concept" (PoC) d'une architecture bancaire Fullstack. 

Il démontre la mise en place d'une chaîne complète de communication entre une base de données, une API robuste et une interface utilisateur moderne, le tout conteneurisé pour la production.

## Stack Technique
* **Backend :** Java 21, Spring Boot 3, Spring Data JPA, H2 Database
* **Frontend :** React 18, Vite, Axios
* **DevOps :** Docker, Docker Compose
* **Architecture :** Modèle 3 couches (Controller, Service, Repository), API RESTful
* **Déploiement :** Machine Virtuelle Microsoft Azure (Linux)

## Déploiement en ligne (Live Demo)
L'application est entièrement déployée en production et accessible publiquement via Microsoft Azure :

👉 **Interface Web (React) :** [http://20.215.192.13](http://20.215.192.13)
👉 **Console de Base de données (H2) :** [http://20.215.192.13:8080/h2-console](http://20.215.192.13:8080/h2-console) 
*(JDBC URL: `jdbc:h2:mem:testdb` | User: `sa` | Sans mot de passe)*
👉 **API Backend (Endpoints) :** `http://20.215.192.13:8080/api/comptes`

*(Note : L'interface web communique en temps réel avec l'API Spring Boot et la base de données conteneurisées sur le serveur grâce aux configurations CORS).*  

## Comment lancer le projet localement ?

Grâce à Docker, le projet se lance facilement. Assurez-vous d'avoir Docker installé et lancé sur votre machine.

> **⚠️ Important :** Le code actuel du Frontend est configuré pour la production et pointe vers l'API déployée sur Azure (`20.215.192.13`). Pour un fonctionnement 100% local, remplacez cette IP par `localhost` dans les requêtes de votre Frontend (React) avant de compiler.

1. Clonez ce repository :
   ```bash
   git clone [https://github.com/Aimenkhimoum/Api-banque.git](https://github.com/Aimenkhimoum/Api-banque.git)
   ```
2. Placez-vous dans le dossier :
  ```bash
  cd Api-banque
   ``` 
3.Lancez la construction et l'exécution des conteneurs :    
```bash
  docker-compose up --build
   ```

