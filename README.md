# Chat Application

## Overview

This is a simple chat application implemented in Java. It includes a server (`ChatServer`) and a client (`ChatClient`). Multiple clients can connect to the server, send messages, and receive messages from other connected clients.

## Running the Application

1. **Compile the Code:**

2. **Start the Server:**

3. **Start Multiple Clients:**

## Implementation Details

- **ChatServer:** Manages client connections and broadcasts messages to all clients.
- **ChatClient:** Connects to the server, sends messages, and displays received messages.

## Notes

- Ensure that the server is started before the clients.
- Clients can be run on the same machine or different machines on the same network by changing the `SERVER_ADDRESS` in `ChatClient.java`.
