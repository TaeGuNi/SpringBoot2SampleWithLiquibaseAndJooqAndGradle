# Spring Boot 2 Sample with Liquibase and Jooq and Gradle

## Requirement

* openjdk13
* mysql 8
* sonarqube 8.1

## Install guide for Mac OS X

  * homebrew
  
    ```bash
    $ /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)"
    ```
  
  * openjdk
  
    ```bash
    $ brew install openjdk
    ```
  
  * mysql
  
    ```bash
    $ brew install mysql
    $ brew services start mysql
    $ mysql
    ```
    
    ```mysql
    mysql> create user if not exists sample@localhost identified by 'sample';
    mysql> create database if not exists sample;
    mysql> grant all privileges on sample.* to sample@localhost;
    mysql> flush privileges;
    ```
  
  * sonarqube
  
    ```bash
    $ brew install sonarqube
    $ brew services start sonarqube
    ```

## How to setup project

  * init
    ```bash
    $ ./gradlew init
    ```

  * Liquibase diffChangeLog
    * Edit entity file(s) in package `sample.model.entities`
    * Generate change log file
	
      ```bash
      $ ./gradlew :model:clean :model:compileJava :model:diffChangeLog \
        -PrunList=diff \
        -x :model:update \
        -x :model:generateModelJooqSchemaSource
      ```

    * Edit `db.changelog-master.yml`

      ```yaml
      ...
          - include:
              file: changelog/<new>_changelog.yml
              relativeToChangelogFile: true
      ```

  * Run

    ```bash
    $ ./gradlew :app:bootRun
    ```

## Sonarqube

* Open web browser [http://localhost:9000](http://localhost:9000)
* See projects `sample.model` and `sample.app`

> Please enjoy!
