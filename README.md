# SelfHealingPOC

## Overview
SelfHealingPOC is a proof of concept project for implementing self-healing capabilities in automated testing frameworks. The goal is to automatically detect and fix issues in test scripts to improve the stability and reliability of the testing process.

## Features
- Self-healing of broken test scripts
- Integration with popular testing frameworks
- Comprehensive reporting and analytics
- Easy configuration and setup

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Configuration](#configuration)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

### General
- Java 11 or higher
- Maven

### Using Docker
- Docker
- Docker Compose

### Using PostgreSQL
- PostgreSQL

## Installation

### Using Docker
1. **Clone the repository**:
    ```bash
    git clone https://github.com/vijayHyperface/SelfHealingPOC.git
    cd SelfHealingPOC
    ```

2. **Build the project**:
    ```bash
    mvn clean install
    ```

3. **Run Docker Compose**:
    Navigate to the `infra` folder and run Docker Compose:
    ```bash
    cd infra
    docker-compose up
    ```

### Using PostgreSQL
1. **Clone the repository**:
    ```bash
    git clone https://github.com/vijayHyperface/SelfHealingPOC.git
    cd SelfHealingPOC
    ```

2. **Build the project**:
    ```bash
    mvn clean install
    ```

3. **Run the Healenium start script**:
    ```bash
    sudo ./start_healenium.sh
    ```

## Usage
To run the tests, use the following command:

