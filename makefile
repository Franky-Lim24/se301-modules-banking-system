# Makefile for compiling and running Java modules

# Variables
MODULE_PATH = out
MODULE_SRC_PATH = .
FIND_JAVA_FILES = $(shell find . -name "*.java")

# Default target
all: compile run

# Run the application
run:
	@echo "Running the application..."
	java --module-path $(MODULE_PATH) -m service_consumer/com.bank.consumer.Main

# Compile the modules
compile:
	@echo "Compiling Java modules..."
	javac -d $(MODULE_PATH) --module-source-path $(MODULE_SRC_PATH) $(FIND_JAVA_FILES)

# Clean target
clean:
	@echo "Cleaning up compiled files..."
	rm -rf $(MODULE_PATH)

.PHONY: all run compile clean
