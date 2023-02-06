ZHE_FOLDER = ./
TEXTS_FOLDER = $(ZHE_FOLDER)text_files/

JAR_DEPENDECIES = ./target/ZheFuscatorSetup-1.0-SNAPSHOT-jar-with-dependencies.jar 
JAVA = java

all: encrypt

encrypt:
	@$(JAVA) -jar $(JAR_DEPENDECIES) -I:$(TEXTS_FOLDER)original.txt -O:$(TEXTS_FOLDER)encrypted.txt -e -K:defaultkey123456
	@echo "** original text **\n"
	@cat $(TEXTS_FOLDER)original.txt
	@echo "\n\n** encrypted text **\n"
	@cat $(TEXTS_FOLDER)encrypted.txt
decrypt:
	@$(JAVA) -jar $(JAR_DEPENDECIES) -I:$(TEXTS_FOLDER)encrypted.txt -O:$(TEXTS_FOLDER)decrypted.txt -d -K:defaultkey123456
	@echo "\n\n** encrypted text **\n"
	@cat $(TEXTS_FOLDER)encrypted.txt
	@echo "\n** decrypted text **\n"
	@cat $(TEXTS_FOLDER)decrypted.txt
clean:
