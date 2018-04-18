# HashiCorp Vault Setup

Download from : https://www.vaultproject.io/downloads.html

__run it in Dev mode__

__#./vault server -dev -dev-root-token-id=00000000-0000-0000-0000-000000000000__

Upon starting the vault server , you will see a line with the root_token value. 

Place it in your bootstrap.properties (in resource folder): 
