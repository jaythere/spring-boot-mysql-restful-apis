Install mySql

brew install mysql

to setup password - mysecurepassword locally

```
We've installed your MySQL database without a root password. To secure it run:
    mysql_secure_installation

MySQL is configured to only allow connections from localhost by default

To connect run:
    mysql -uroot

To restart mysql after an upgrade:
  brew services restart mysql
Or, if you don't want/need a background service you can just run:
  /usr/local/opt/mysql/bin/mysqld_safe --datadir=/usr/local/var/mysql
==> Summary
🍺  /usr/local/Cellar/mysql/8.0.30: 312 files, 297MB
==> Running `brew cleanup mysql`...
Disable this behaviour by setting HOMEBREW_NO_INSTALL_CLEANUP.
Hide these hints with HOMEBREW_NO_ENV_HINTS (see `man brew`).
```

`brew install mysql`

Run MySql

`brew services start mysql`

Install TablePlus for visual representation

JDBC Driver, JDBC URL, UserName, Password, MySQL Hibernate Dilect as we are using Hibernate
