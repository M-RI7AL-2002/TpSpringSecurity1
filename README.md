# TP : Mise en place de Spring Security avec gestion des rôles et filtrage des endpoints

## Objectif du TP

L'objectif de ce travail pratique est de configurer Spring Security dans une application Spring Boot.  
Vous allez apprendre à :

- Initialiser Spring Security dans un projet Spring Boot  
- Créer et configurer des utilisateurs et des rôles (USER, ADMIN)  
- Mettre en place un système d'authentification  
- Restreindre l'accès aux endpoints selon le rôle de l'utilisateur  
- Comprendre le fonctionnement du SecurityFilterChain et des règles d'autorisation

---

## Contenu du TP

### 1. Configuration de Spring Security
- Ajouter la dépendance `spring-boot-starter-security`
- Créer une classe de configuration `SecurityConfig`

### 2. Déclaration des utilisateurs et rôles
- Définir des utilisateurs en mémoire ou via un service dédié
- Attribuer les rôles : `ROLE_USER`, `ROLE_ADMIN`

### 3. Sécurisation des endpoints
Exemples de règles d'accès :
- `/public/**` : accessible à tous
- `/user/**` : réservé au rôle `USER`
- `/admin/**` : réservé au rôle `ADMIN`


 
- Gérer des rôles et des utilisateurs  
- Protéger des endpoints en fonction des rôles authentifiés  
