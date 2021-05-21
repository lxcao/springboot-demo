###
 # @Author: clingxin
 # @Date: 2021-05-20 20:37:27
 # @LastEditors: clingxin
 # @LastEditTime: 2021-05-20 20:58:06
 # @FilePath: /springboot-demo/scripts.sh
###
#postgre
docker run -it --name mypostgres --restart always -e POSTGRES_PASSWORD='abc123' -e ALLOW_IP_RANGE=0.0.0.0/0 -v /Users/caolingxin/Documents/workspaces/docker-volume/postgres:/var/lib/postgresql -p 55433:5432 -d postgres
#postgre username:postgre/ password:abc123
#pgAdmin
docker run -d -p 55434:80 --name mypgadmin4 -e PGADMIN_DEFAULT_EMAIL=caolingxin@hotmail.com -e PGADMIN_DEFAULT_PASSWORD=abc123 dpage/pgadmin4
#connect hostname:host.docker.internal