# HashiCorp Vault Setup

Download from : https://www.vaultproject.io/downloads.html 

1. Run Vault in Dev Mode

__./vault server -dev -dev-root-token-id=00000000-0000-0000-0000-000000000000__

2. In a seperate terminal window, run:

__export VAULT_ADDR='http://127.0.0.1:8200'__

3.  Re-create the secrets engine store with v1 instead of v2 of KV engine. ( v 0.10.0 introduced some breaking API changes, this is why this is required)

__./vault secrets disable secret__

__./vault secrets enable -version=1 -path=secret kv__

4. Add our key to the store.

__./vault write secret/helloworld secretmessage=sdfsdfsdfsdf__

5. Run your Spring Boot App.  You can access it in a browser at : http://localhost:8080/secret

6. To force a refresh of configuration variables hit the /refresh endpoint.

__curl -X POST http://localhost:8080/actuator/refresh__

Note you can also access Vault via the GUI at :
http://localhost:8200 (via browser)

