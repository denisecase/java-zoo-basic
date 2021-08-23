# java-zoo-basic

> 

## Create a Project from Nothing

1. Open NetBeans on your machine
2. Project / New / Maven Project - give it a name java-zoo-basic
3. set package to edu.nwmissouri.csis

Add code files

1. Project / New / Class - set name and package for each file
2. Add code contents for each file

Set project main executable class 

1. Project / Properties / Run / Main Class / Browse (select ZooSimulation)

Run the app

1. Project / Run (or click green arrow)
2. Verify everything works as expected

## Create a Cloud Repo to Store your Project

In GitHub

1. Create a repo named java-zoo-basic 
2. Keep it completely empty - we'll bring up code from our machine.

## Put your Project under Source Control (with Git)

1. On your machine, in the java-zoo-basic folder, right-click and open Git Bash.
2. Type the following commands - change my username (denisecase) to yours. 
3. Use your repo name (e.g., java-zoo-basic).

```Bash
git init (or use TortoiseGit / Create repository here)
git branch -m master main (move the default master branch to main)
git remote add origin https://github.com/denisecase/java-zoo-basic.git
git branch -M main
git add .
git commit -m "initial commit"
git push -u origin main
```

