# HashiCorp Vault Setup

Download from : https://www.vaultproject.io/downloads.html 

__run it in Dev mode__

__#./vault server -dev -dev-root-token-id=00000000-0000-0000-0000-000000000000__

The v2 (part of Vault 10) KV store backend seems to breaks compatiblity .. you will need to re-create the /secret engine with the v1 KV store .. Run the following commands:

__
./vault secrets disable secret
./vault secrets enable -version=1 -path=secret kv
./vault write secret/helloworld secret=sdfsdfsdfsdf
__



Note you can also access Vault via the GUI at :
http://localhost:8200 (via browser)

