package nain.apirest.oauth;

public class JWTConfig {
	
	public static final String LLAVE_SECRETA = "clave.secreta.2020";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpQIBAAKCAQEAxgTFTXK8z7q9xTkuDsYK5JXHKqThIvEjju30XsCBv/wSyDen\r\n" + 
			"ft/r6Q2bJG76PAuCVLgaBYibVGv3s8n0bUzZfgIHJbiYnF9RXwZCLUX6YvCU9gYK\r\n" + 
			"y9PkwpB3Tfj4aW7+ixDDkE5HJKOAhYO1UJt50QKnoJUZb938khQWPrbf84VrHPbz\r\n" + 
			"d8TooUlhK/NQ8pEIrUJ/dYCsQfLDHdBqUx40cpVMhzUD3FvA9VtP+vtcrJ/78BQT\r\n" + 
			"rfH5TwhWifYuua22AwqazLDm/9yjnBErn2PnT/voBV8mrCpITkh5ZtBT7DMGwPSk\r\n" + 
			"nWces26Psttv4nDuYVyUfkU+sck0Hz3iZXNRJwIDAQABAoIBAQCAHeIR4+RpemcB\r\n" + 
			"zacRA+1US9vaqWbIlr/s3+Q10dOhBVSZmfiSzAn0dUslXXAlnUSrz5l2bxYgnuJa\r\n" + 
			"vpWYihpFvsYlD7QdqEYbdw8l/5qqnQGj0/D0Q5pEj/fAyQ7gGGI0U5pUKXE6MVcc\r\n" + 
			"C0UqbA16v375FL6qdDPPx5NE7EklYs9639yF5LXJakC2aqscRTiGN+et+9X1zipN\r\n" + 
			"OrnEH+aKG8VziVmGlEXqi/DWf212sn5leJku/yT0zgtxWbmr/yARk67uFK2KX6JD\r\n" + 
			"yfKmJzzFUUGei46bJIW7ynrKngWeLiNNlL6TRcZ1A50L3dyEU6i93BpwNzrVy3DY\r\n" + 
			"vlXKbD1RAoGBAOrCIA1+riOMmqFJV7kWEhwuFdQ53Zi9x8SPVMCkSNf47xgoVv6t\r\n" + 
			"Cm3FWwD3pD4UPKaPZ7qaNy6NvGCu6fUsnYZQaf247VhStZnBvQX8w32qBE4zxxra\r\n" + 
			"ZTwcPGsu8bd3anRWM6M1QPiyk2BK+6MFzq8mobZ0Gs34yQ8QvKDJ+r9lAoGBANfv\r\n" + 
			"nkhiiy+Xvk0fC+FtkuD7D3XWoiWVHs9lShPHrGxdnxtwqSyPv8JO0TVKdbrIiwFJ\r\n" + 
			"yQiyZ2pDy9UD/Jf9koW9QTsaVcM1OsPYlrBsb2UkGfjyLU8lFGkiVht+d3QvZw7j\r\n" + 
			"BQjYSVkyN8yfxomH85CkLMrQha8bhJ1YgT2wwkObAoGAcEpy8oGJ4k87F7LxVwML\r\n" + 
			"npccsesL6Ce/CnJU4+CxRz03gKKrGh7DQkaIhSnvUhJ0AGfQAh4KDyaU2NpR5oh0\r\n" + 
			"wO5uBIMUZI8LdoSJWffRuqY8cPurXVjh26LV85781/ky3nrtMEAk19DzVbgILa51\r\n" + 
			"cqpT5+YZfDRoV+B1maODYVECgYEAsCFzKfe3MArF3oIEXsvRklE2OxfnCmCn0OL9\r\n" + 
			"mUS1D28N6IPsebyG3ScM3jrt7HzHZTWaFM3wLG1ARXALCK58ZToJivvgGGnClRyF\r\n" + 
			"TUIlWoon5TckXfoQu/CV67csGEjR9wKViLFioq6jdPSeLHAH62L+Zi/P2xTHBtC6\r\n" + 
			"GmejDSECgYEA5scR/dZjqw63/l7zg0Q3NpxPieMNQ4RjW+uZLKQp2DcS8QG7fLFu\r\n" + 
			"dhYjebgE+s+4czn+sGnyVAA9rPo3YBSgg3U9AfT876hSZTQqmNCH6OsLxM2RqRNy\r\n" + 
			"agA/jMqaccRbVi1cCHyXCh2bYcWhAhQPtsCLkuTCXq9cFSl9DUrsXGI=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxgTFTXK8z7q9xTkuDsYK\r\n" + 
			"5JXHKqThIvEjju30XsCBv/wSyDenft/r6Q2bJG76PAuCVLgaBYibVGv3s8n0bUzZ\r\n" + 
			"fgIHJbiYnF9RXwZCLUX6YvCU9gYKy9PkwpB3Tfj4aW7+ixDDkE5HJKOAhYO1UJt5\r\n" + 
			"0QKnoJUZb938khQWPrbf84VrHPbzd8TooUlhK/NQ8pEIrUJ/dYCsQfLDHdBqUx40\r\n" + 
			"cpVMhzUD3FvA9VtP+vtcrJ/78BQTrfH5TwhWifYuua22AwqazLDm/9yjnBErn2Pn\r\n" + 
			"T/voBV8mrCpITkh5ZtBT7DMGwPSknWces26Psttv4nDuYVyUfkU+sck0Hz3iZXNR\r\n" + 
			"JwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----\r\n" + 
			"";
	
}
