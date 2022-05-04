javac --module cat.institutmvm.application -d bin --module-source-path .\*\src\
javac --module com.institutmvm.controller -d bin --module-source-path .\*\src\
java --module-path .\bin --module com.institutmvm.controller/com.institutmvm.controller.ui.App