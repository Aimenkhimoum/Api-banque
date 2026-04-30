# 🏦 Système de Gestion Bancaire MVP

Ce projet est un "Proof of Concept" (PoC) d'une architecture bancaire Fullstack, réalisé dans le cadre de ma préparation technique pour la Société Générale (X-BLOCKS). 

Il démontre la mise en place d'une chaîne complète de communication entre une base de données, une API robuste et une interface utilisateur moderne, le tout conteneurisé pour la production.

## Stack Technique
* **Backend :** Java 21, Spring Boot 3, Spring Data JPA, H2 Database
* **Frontend :** React 18, Vite, Axios
* **DevOps :** Docker, Docker Compose
* **Architecture :** Modèle 3 couches (Controller, Service, Repository), API RESTful

## Comment lancer le projet localement ?

Grâce à Docker, le projet se lance en une seule ligne de commande. 
Assurez-vous d'avoir Docker installé et lancé sur votre machine.

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
## Accès aux services
  Interface Web (React) : http://localhost

  API Backend (Spring Boot) : http://localhost:8080/api/comptes

  Base de données (Console H2) : http://localhost:8080/h2-console
  (JDBC URL: jdbc:h2:mem:testdb)

##  Déploiement en ligne (Live Demo)
L'application est actuellement déployée et accessible publiquement via une machine virtuelle Microsoft Azure :
👉 **[Tester l'application en ligne](http://20.215.192.13)**

*(Note : L'interface web communique en temps réel avec l'API Spring Boot et la base de données conteneurisées sur le serveur).*  
