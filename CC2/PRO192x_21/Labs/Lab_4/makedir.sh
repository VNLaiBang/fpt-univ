#!/bin/bash

for file in *; do
    if [ -f "$file" ] && [ "$file" != "makedir.sh" ]; then
        directory="${file%.*}"
        mkdir -p "$directory"
        mv "$file" "$directory"
    fi
done

# Function to remove string from files in a directory
remove_string() {
    local directory="$1"
    local string_to_remove="package Lab_4;"

    # Loop through all files in the directory
    for file in "$directory"/*; do
        if [ -f "$file" ]; then
            # Remove the string from the file using sed
            sed -i "s/$string_to_remove//g" "$file"
        fi
    done
}

# Main script
main() {
    local root_directory="/mnt/d/Study_Folder/Funix/CC2/PRO192/labs/Lab_4"

    # Call the remove_string function for each subdirectory
    for directory in "$root_directory"/*; do
        if [ -d "$directory" ]; then
            remove_string "$directory"
        fi
    done
}

# Run the main script
main
