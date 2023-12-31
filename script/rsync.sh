#!/bin/sh

mkdir -p www
pf recipe/ www/
cd www
tar zcf ../recipes.tar.gz ./
cd ..
scp -i ~/.ssh/portal.pem recipes.tar.gz bitnami@eed3si9n.com:/home/bitnami/work/recipes.tar.gz
ssh bitnami@eed3si9n.com -i ~/.ssh/portal.pem 'tar zxvf /home/bitnami/work/recipes.tar.gz -C /home/bitnami/apps/portal/htdocs/recipes/'
