#!/bin/bash

# Array of repository URLs
urls=(
    "https://drive.google.com/file/d/1IcZKB6syWO4bfD4-mlOy74pZzGajmrII/view"
    "https://drive.google.com/file/d/1srw9ksy5Si_XMxdh0RHe0jqEYt5-tWAc/view"
    "https://drive.google.com/file/d/1vXjIoRWY0aIpYfhj3TnPUGdmJoHnWaOc/edit"
)

download_dir="../application"
# Loop over each URL, extract its ID and then download it
for url in "${urls[@]}"; do
    file_id=$(echo "$url" | sed -n 's/.*\/\([^\/]*\)\/[^\/]*.*/\1/p')
    gdown --id "$file_id" -O "$download_dir"
done
