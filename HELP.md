# Getting Started

### DB VM Info
user: root
Password: @@M0llyb@863*^#
user: db.admin
Password: 12qwaszx!@QWASZX

To start and stop DB (DB should be already be running)
db.admin# pg_ctl start -D /usr/local/pgsql
db.admin# pg_ctl stop -D /usr/local/pgsql

database name is RonnyTom
role/user for RonnyTom: db.admin

### Tools listing and purpose

GitHub: https://www.github.com/tomskradski/RonnyTom.git
IDE: Intellij Ultimate (Does not support TypeScript(used by Angular 2) with Community Edition)
DB OS: Centos7
DB: PostgreSQL
DB Cluster: /usr/local/pgsql
DB Client: Intellij Ultimate or PGAdmin
Application Container: Tomcat (as provided by Spring Boot or spun up by IDE, no 'production' server yet)
Restful Endpoint Testing: Restlet Client (Chrome extension)


