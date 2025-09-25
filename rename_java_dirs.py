import os

# This script renames all directories in the current working directory
# to have their first character capitalized.

# Function to capitalize the first letter of directory names
def capitalize_directories():
    # Get the current working directory

    arr_directoy = [r'C:\GitHub\rafaelfischer\programacaomentoria\curso-java-q\bin', r'C:\GitHub\rafaelfischer\programacaomentoria\curso-java-q\src']
    for current_dir in arr_directoy:
        capitalize_subdirectories(current_dir)
    


def capitalize_subdirectories(path):
    # List all items in the given directory
    for item in os.listdir(path):
        item_path = os.path.join(path, item)
        # Check if the item is a directory
        if os.path.isdir(item_path):
            # Create new name with first character capitalized
            new_name = item[0].upper() + item[1:]
            new_item_path = os.path.join(path, new_name)
            
            # Skip if the name is already in the desired format
            if item != new_name:
                try:
                    # Rename the directory
                    os.rename(item_path, new_item_path)
                    print(f"Renamed: {item_path} -> {new_item_path}")
                except OSError as e:
                    print(f"Error renaming {item_path}: {e}")
            
            # Recursively capitalize subdirectories
            capitalize_subdirectories(new_item_path)

# Run the function
if __name__ == "__main__":
    capitalize_directories()